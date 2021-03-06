package com.tamsiree.rxui.view.popupwindows.tools;

import java.util.Locale;

/**
 * @author Tamsiree
 */
class RxPopupViewTool {

    static boolean isRtl() {
        Locale defLocal = Locale.getDefault();
        return Character.getDirectionality(defLocal.getDisplayName(defLocal).charAt(0))
                == Character.DIRECTIONALITY_RIGHT_TO_LEFT;
    }
}
