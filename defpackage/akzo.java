package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akzo extends aonm implements aooz {
    public static final akzo a;
    private static volatile aopf l;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f = 1;
    public int g = 1;
    public int h = 1;
    public double i;
    public int j;
    public int k;
    private int m;

    static {
        akzo akzoVar = new akzo();
        a = akzoVar;
        aonm.registerDefaultInstance(akzo.class, akzoVar);
    }

    private akzo() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bက\u0007\tဌ\b\nင\t", new Object[]{"m", "b", "c", "d", "e", "f", asaq.g, "g", asaq.f, "h", asaq.f, "i", "j", asaq.h, "k"});
            case NEW_MUTABLE_INSTANCE:
                return new akzo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (akzo.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
