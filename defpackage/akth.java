package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akth {
    ANR("anr_detection.journal", "anr_journals"),
    JAVA_CRASH("javacrash_detection.journal", "javacrash_journals"),
    NATIVE_CRASH("nativecrash_detection.journal", "nativecrash_journals");

    public final String d;
    public final String e;

    akth(String str, String str2) {
        this.d = str;
        this.e = str2;
    }
}
