package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axtk implements axtj {
    public static final uvr a;

    static {
        uvp a2 = new uvp(uvg.a("com.google.android.gms.feedback")).a();
        a2.e("AndroidFeedback__fix_suggested_article_crash", true);
        a2.e("AndroidFeedback__select_last_chosen_account_in_email_spinner", true);
        a = a2.e("AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        a2.e("AndroidFeedback__trim_feedback_submission", true);
    }

    @Override // defpackage.axtj
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
