package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axtb implements axta {
    public static final uvr a;

    static {
        uvp uvpVar = new uvp(uvg.a("com.google.android.gms.droidguard"));
        uvpVar.e("BugFixesFlags__enable_remove_old_programs_from_database", true);
        a = uvpVar.e("BugFixesFlags__fix_deadlock_if_asynchronous_one_step_api_times_out", true);
    }

    @Override // defpackage.axta
    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
