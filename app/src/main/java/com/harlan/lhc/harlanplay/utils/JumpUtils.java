package com.harlan.lhc.harlanplay.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;

import com.harlan.lhc.harlanplay.DanmkuVideoActivity;
import com.harlan.lhc.harlanplay.DetailListPlayer;
import com.harlan.lhc.harlanplay.DetailMoreTypeActivity;
import com.harlan.lhc.harlanplay.DetailPlayer;
import com.harlan.lhc.harlanplay.FragmentVideoActivity;
import com.harlan.lhc.harlanplay.InputUrlDetailActivity;
import com.harlan.lhc.harlanplay.ListVideo2Activity;
import com.harlan.lhc.harlanplay.ListVideoActivity;
import com.harlan.lhc.harlanplay.PlayActivity;
import com.harlan.lhc.harlanplay.R;
import com.harlan.lhc.harlanplay.RecyclerView2Activity;
import com.harlan.lhc.harlanplay.RecyclerViewActivity;
import com.harlan.lhc.harlanplay.WebDetailActivity;


/**
 * Created by shuyu on 2016/11/11.
 */

public class JumpUtils {

    /**
     * 跳转到视频播放
     *
     * @param activity
     * @param view
     */
    public static void goToVideoPlayer(Activity activity, View view) {
        Intent intent = new Intent(activity, PlayActivity.class);
        intent.putExtra(PlayActivity.TRANSITION, true);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            Pair pair = new Pair<>(view, PlayActivity.IMG_TRANSITION);
            ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(
                    activity, pair);
            ActivityCompat.startActivity(activity, intent, activityOptions.toBundle());
        } else {
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
        }
    }

    /**
     * 跳转到视频列表
     *
     * @param activity
     */
    public static void goToVideoPlayer(Activity activity) {
        Intent intent = new Intent(activity, ListVideoActivity.class);
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(activity);
        ActivityCompat.startActivity(activity, intent, activityOptions.toBundle());
    }

    /**
     * 跳转到视频列表2
     *
     * @param activity
     */
    public static void goToVideoPlayer2(Activity activity) {
        Intent intent = new Intent(activity, ListVideo2Activity.class);
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(activity);
        ActivityCompat.startActivity(activity, intent, activityOptions.toBundle());
    }

    /**
     * 跳转到视频列表
     *
     * @param activity
     */
    public static void goToVideoRecyclerPlayer(Activity activity) {
        Intent intent = new Intent(activity, RecyclerViewActivity.class);
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(activity);
        ActivityCompat.startActivity(activity, intent, activityOptions.toBundle());
    }

    /**
     * 跳转到视频列表2
     *
     * @param activity
     */
    public static void goToVideoRecyclerPlayer2(Activity activity) {
        Intent intent = new Intent(activity, RecyclerView2Activity.class);
        ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(activity);
        ActivityCompat.startActivity(activity, intent, activityOptions.toBundle());
    }

    /**
     * 跳转到详情播放
     *
     * @param activity
     */
    public static void goToDetailPlayer(Activity activity) {
        Intent intent = new Intent(activity, DetailPlayer.class);
        activity.startActivity(intent);
    }

    /**
     * 跳转到详情播放
     *
     * @param activity
     */
    public static void goToDetailListPlayer(Activity activity) {
        Intent intent = new Intent(activity, DetailListPlayer.class);
        activity.startActivity(intent);
    }


    /**
     * 跳转到详情播放
     *
     * @param activity
     */
    public static void gotoWebDetail(Activity activity) {
        Intent intent = new Intent(activity, WebDetailActivity.class);
        activity.startActivity(intent);
    }

    /**
     * 跳转到弹幕
     *
     * @param activity
     */
    public static void gotoDanmaku(Activity activity) {
        Intent intent = new Intent(activity, DanmkuVideoActivity.class);
        activity.startActivity(intent);
    }

    /**
     * 跳转到Fragment
     *
     * @param activity
     */
    public static void gotoFragment(Activity activity) {
        Intent intent = new Intent(activity, FragmentVideoActivity.class);
        activity.startActivity(intent);
    }

    /**
     * 跳到多类型
     * @param activity
     */
    public static void gotoMoreType(Activity activity) {
        Intent intent = new Intent(activity, DetailMoreTypeActivity.class);
        activity.startActivity(intent);
    }

    /**
     * 跳到可输入
     * @param activity
     */
    public static void gotoInput(Activity activity) {
        Intent intent = new Intent(activity, InputUrlDetailActivity.class);
        activity.startActivity(intent);
    }
}
