package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wyl {
    public static final amri a;
    public static final amri b;
    public static final amri c;
    public static final amri d;
    public static final amri e;

    static {
        amrg b2 = amri.b();
        b2.d(8, apag.TRIGGER_CATEGORY_SLOT_ENTRY);
        b2.d(7, apag.TRIGGER_CATEGORY_SLOT_FULFILLMENT);
        b2.d(6, apag.TRIGGER_CATEGORY_SLOT_EXPIRATION);
        b2.d(1, apag.TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL);
        b2.d(2, apag.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED);
        b2.d(3, apag.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED);
        b2.d(4, apag.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED);
        b2.d(5, apag.TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED);
        b2.d(0, apag.TRIGGER_CATEGORY_PING_DISPATCH);
        a = b2.b();
        amrg b3 = amri.b();
        b3.d(0, apab.CONTROL_FLOW_MANAGER_LAYER_UNSPECIFIED);
        b3.d(1, apab.CONTROL_FLOW_MANAGER_LAYER_CORE);
        b3.d(2, apab.CONTROL_FLOW_MANAGER_LAYER_ADAPTER);
        b3.d(3, apab.CONTROL_FLOW_MANAGER_LAYER_SURFACE);
        b3.d(4, apab.CONTROL_FLOW_MANAGER_LAYER_EXTERNAL);
        b = b3.b();
        amrg b4 = amri.b();
        b4.d(0, apaa.ADS_CLIENT_EVENT_TYPE_NORMAL_EXIT_LAYOUT_REQUESTED);
        b4.d(2, apaa.ADS_CLIENT_EVENT_TYPE_SKIP_EXIT_LAYOUT_REQUESTED);
        b4.d(3, apaa.ADS_CLIENT_EVENT_TYPE_MUTE_EXIT_LAYOUT_REQUESTED);
        b4.d(4, apaa.ADS_CLIENT_EVENT_TYPE_ABANDON_EXIT_LAYOUT_REQUESTED);
        b4.d(5, apaa.ADS_CLIENT_EVENT_TYPE_USER_INPUT_SUBMITTED_EXIT_LAYOUT_REQUESTED);
        b4.d(6, apaa.ADS_CLIENT_EVENT_TYPE_USER_CANCELLED_EXIT_LAYOUT_REQUESTED);
        c = b4.b();
        amrg b5 = amri.b();
        b5.d(0, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_NORMALLY);
        b5.d(2, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_SKIP);
        b5.d(3, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_MUTE);
        b5.d(4, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_ABANDON);
        b5.d(5, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_INPUT_SUBMITTED);
        b5.d(6, apaa.ADS_CLIENT_EVENT_TYPE_LAYOUT_EXITED_USER_CANCELLED);
        d = b5.b();
        amrg b6 = amri.b();
        b6.d(1, "TRIGGER_CATEGORY_LAYOUT_EXIT_NORMAL");
        b6.d(2, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_SKIPPED");
        b6.d(3, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_MUTED");
        b6.d(4, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_INPUT_SUBMITTED");
        b6.d(5, "TRIGGER_CATEGORY_LAYOUT_EXIT_USER_CANCELLED");
        b6.d(6, "TRIGGER_CATEGORY_SLOT_EXPIRATION");
        b6.d(7, "TRIGGER_CATEGORY_SLOT_FULFILLMENT");
        b6.d(8, "TRIGGER_CATEGORY_SLOT_ENTRY");
        b6.d(0, "TRIGGER_CATEGORY_PING_DISPATCH");
        b6.b();
        amrg b7 = amri.b();
        b7.d("AD_CPN", apad.AD_CLIENT_PLAYBACK_NONCE_KEY);
        b7.d("AD_MT", apad.AD_CURRENT_TIME_MS);
        b7.d("BLOCKING_ERROR", apad.BLOCKING_ERROR);
        b7.d("CPN", apad.CLIENT_PLAYBACK_NONCE_KEY);
        b7.d("ERROR_MSG", apad.ERROR_MESSAGE);
        b7.d("GOOGLE_VIEWABILITY", apad.GOOGLE_VIEWABILITY);
        b7.d("INTERNAL_ID", apad.INTERNAL_ID);
        b7.d("I_X", apad.AD_INTERACTION_X);
        b7.d("I_Y", apad.AD_INTERACTION_Y);
        b7.d("MIDROLL_POS", apad.MIDROLL_POS_SEC);
        b7.d("MOAT_VIEWABILITY", apad.THIRD_PARTY_VIEWABILITY);
        b7.d("MT", apad.CONTENT_CURRENT_TIME_MS);
        b7.d("P_H", apad.PLAYER_HEIGHT);
        b7.d("P_W", apad.PLAYER_WIDTH);
        b7.d("RWT", apad.REQUEST_WALL_TIME_MS);
        b7.d("VIEWABILITY", apad.ACTIVE_VIEW);
        b7.d("VIS", apad.PLAYER_VISIBILITY);
        b7.d("VSS_AD_CPN", apad.VSS_AD_CLIENT_PLAYBACK_NONCE_KEY);
        b7.d("YT_ERROR_CODE", apad.YT_ERROR_CODE);
        e = b7.b();
    }
}
