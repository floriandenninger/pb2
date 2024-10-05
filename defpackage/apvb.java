package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apvb extends aonm implements aooz {
    public static final apvb a;
    private static volatile aopf m;
    public int b;
    public double c;
    public int d;
    public int e;
    public boolean f;
    public int g = 1;
    public int h = 1;
    public int i = 1;
    public double j;
    public int k;
    public int l;

    static {
        apvb apvbVar = new apvb();
        a = apvbVar;
        aonm.registerDefaultInstance(apvb.class, apvbVar);
    }

    private apvb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bက\u0007\tဌ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", asaq.g, "h", asaq.f, "i", asaq.f, "j", "k", asaq.h, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apvb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apvb.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
