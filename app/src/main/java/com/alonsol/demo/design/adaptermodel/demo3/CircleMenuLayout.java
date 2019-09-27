package com.alonsol.demo.design.adaptermodel.demo3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.alonsol.demo.R;

public class CircleMenuLayout extends ViewGroup {

    //圆形直径
    private int mRadius;
    //该容器内childitem的默认尺寸
    private static final float RADIO_DEFAULT_CHILD_DIMENSION = 1 / 4f;
    //该容器内边距，无视padding属性，如需边距请用该变量
    private static final float RADIO_PADDING_LAYOUT = 1 / 12f;
    //该容器的内边距，无视padding属性，如需边距请用该变量
    private float mPadding;
    //布局时的开始角度
    private double mStartAngle = 0;
    //菜单项的文本
    private String[] mItemTexts;
    //菜单项的图标
    private int[] mItemImgs;
    //菜单的个数
    private int mMenuItemCount;
    //菜单布局资源id
    private int mMenuItemLayoutId = R.layout.circle_menu_item;


    public CircleMenuLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        //无视padding
        setPadding(0, 0, 0, 0);
    }


    /**
     * 设置菜单条目的图标和文本
     *
     * @param images
     * @param texts
     */
    public void setMenuItemIconsAndTexts(int[] images, String[] texts) {
        if (images == null && texts == null) {
            throw new IllegalArgumentException("菜单项文本和图片至少设置其一");
        }
        mItemImgs = images;
        mItemTexts = texts;
        //初始化mMenuCount
        mMenuItemCount = images == null ? texts.length : images.length;
        if (images != null && texts != null) {
            mMenuItemCount = Math.min(images.length, texts.length);
        }
        //构建菜单项
        buildMenuItems();
    }

    /**
     * 构建菜单项
     */
    private void buildMenuItems() {
        //根据用户设置的参数，初始化menu item
        for (int i = 0; i < mMenuItemCount; i++) {
            View itemView = inflateMenuView(i);
            //初始化菜单项
            initMenuItem(itemView, i);
            //添加view到容器中
            addView(itemView);
        }
    }

    private View inflateMenuView(final int childIndex) {
        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View itemView = mInflater.inflate(mMenuItemLayoutId, this, false);
        itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnMenuItemClicklistener != null) {
                    mOnMenuItemClicklistener.onClick(v, childIndex);
                }
            }
        });
        return itemView;
    }

    private void initMenuItem(View itemView, int childIndex) {
        ImageView imageView = itemView.findViewById(R.id.imageView);
        TextView textView = itemView.findViewById(R.id.textView);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(mItemImgs[childIndex]);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public void setmMenuItemLayoutId(int mMenuItemLayoutId) {
        this.mMenuItemLayoutId = mMenuItemLayoutId;
    }

    private OnItemClickListener mOnMenuItemClicklistener;

    public interface OnItemClickListener {
        void onClick(View view, int index);
    }

    public void setOnItemClicklistener(OnItemClickListener listener) {
        mOnMenuItemClicklistener = listener;
    }
}
