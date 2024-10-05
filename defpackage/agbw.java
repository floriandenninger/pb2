package defpackage;

import android.util.SparseIntArray;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agbw extends SparseIntArray {
    public agbw(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        put(240, 33);
        put(360, 34);
        put(480, 35);
        put(720, 120);
        put(1080, 121);
        put(1440, 10001);
        put(2160, 10002);
    }

    public agbw(char[] cArr) {
        put(0, R.drawable.quantum_ic_error_white_36);
        put(1, R.color.live_chat_dark_loading_error_color);
        put(2, R.color.yt_light_red);
        put(3, R.dimen.live_chat_dark_drawer_collapsed_height);
        put(4, R.dimen.live_chat_dark_collapsed_height);
        put(5, R.layout.live_chat_dark_empty_state_message);
        put(6, R.style.live_chat_dark_empty_state_message_emphasize);
        put(7, R.integer.live_chat_dark_inactive_send_button_icon_alpha);
        put(8, R.layout.live_chat_button_subtext_dark);
        put(9, R.layout.live_chat_action_button_grey_dark);
        put(10, R.drawable.quantum_ic_arrow_drop_down_white_24);
        put(11, R.color.yt_black1);
        put(13, R.color.yt_black1);
        put(12, R.drawable.quantum_ic_info_outline_white_24);
    }

    public agbw(byte[] bArr, byte[] bArr2) {
        put(0, R.drawable.quantum_ic_error_black_36);
        put(1, R.color.live_chat_light_loading_error_color);
        put(2, R.color.yt_medium_red);
        put(3, R.dimen.live_chat_light_drawer_collapsed_height);
        put(4, R.dimen.live_chat_light_collapsed_height);
        put(5, R.layout.live_chat_light_empty_state_message);
        put(6, R.style.live_chat_light_empty_state_message_emphasize);
        put(7, R.integer.live_chat_light_inactive_send_button_icon_alpha);
        put(8, R.layout.live_chat_button_subtext_light);
        put(9, R.layout.live_chat_action_button_grey_light);
        put(10, R.drawable.quantum_ic_arrow_drop_down_black_24);
        put(11, R.color.yt_white3);
        put(13, R.color.yt_white1);
        put(12, R.drawable.quantum_ic_info_outline_grey600_24);
    }

    public agbw(byte[] bArr) {
        super(5);
        put(0, R.id.first_survey_option);
        put(1, R.id.second_survey_option);
        put(2, R.id.third_survey_option);
        put(3, R.id.fourth_survey_option);
        put(4, R.id.fifth_survey_option);
    }

    public agbw() {
        super(5);
        put(0, R.id.first_survey_option_click);
        put(1, R.id.second_survey_option_click);
        put(2, R.id.third_survey_option_click);
        put(3, R.id.fourth_survey_option_click);
        put(4, R.id.fifth_survey_option_click);
    }
}
