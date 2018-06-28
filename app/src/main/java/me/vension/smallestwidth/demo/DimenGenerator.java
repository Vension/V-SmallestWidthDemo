package me.vension.smallestwidth.demo;


import java.util.ArrayList;
import java.util.List;

/**
 * ========================================================
 * 作  者：Vension
 * 日  期：2018/6/28 10:10
 * 描  述：smallestWidth适配，或者叫sw限定符适配。
 *        指的是Android会识别屏幕可用高度和宽度的最小尺寸的dp值（其实就是手机的宽度值），
 *        然后根据识别到的结果去资源文件中寻找对应限定符的文件夹下的资源文件。
 * ========================================================
 */

public class DimenGenerator {

    /**
     * 设计稿尺寸(根据自己设计师的设计稿的宽度填入)
     */
    private static final int DESIGN_WIDTH = 375;

    /**
     * 设计稿高度  没用到
     */
    private static final int DESIGN_HEIGHT = 667;

    public static void main(String[] args) {
//        DimenTypes[] values = DimenTypes.values();
        for (int value : getDimens()) {
            MakeUtils.makeAll(DESIGN_WIDTH, value, "/androidUI/adapter");
        }

    }
    
    /**
     *  适配Android 3.2以上   大部分手机的sw值集中在  300-460之间 
     *  从300 ~ 500 
     **/
    private static List<Integer> getDimens() {
        List<Integer> dimens = new ArrayList<>();
        for (int i = 300; i <= 500; i += 10) {
            dimens.add(i);
        }
        return dimens;
    }

}
