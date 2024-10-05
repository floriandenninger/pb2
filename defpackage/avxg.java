package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxg extends aonm implements aooz {
    public static final avxg a;
    private static volatile aopf g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;

    static {
        avxg avxgVar = new avxg();
        a = avxgVar;
        aonm.registerDefaultInstance(avxg.class, avxgVar);
    }

    private avxg() {
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
                return newMessageInfo(a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဇ\b\u0005ြ\u0000\u0006ြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"d", "c", "b", "e", avts.r, avxh.class, avxf.class, "f", avxi.class, avxe.class, avxb.class, avxd.class, avxm.class});
            case NEW_MUTABLE_INSTANCE:
                return new avxg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avxg.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
