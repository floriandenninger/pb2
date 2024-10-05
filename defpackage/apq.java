package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class apq implements apo {
    public static apq b;

    @Override // defpackage.apo
    public apm a(Class cls) {
        try {
            Object newInstance = cls.newInstance();
            newInstance.getClass();
            return (apm) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(azul.a("Cannot create an instance of ", cls), e2);
        }
    }
}
