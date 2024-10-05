package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class axna {
    public static axna d(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new axmv(cls.getSimpleName());
        }
        return new axmx(cls.getSimpleName());
    }

    public abstract void a(String str);

    public abstract void b(String str);

    public abstract void c(String str);
}
