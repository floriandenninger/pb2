package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ashd extends aonm implements aooz {
    public static final ashd a;
    private static volatile aopf h;
    public int b;
    public Object d;
    public apai e;
    public asgy g;
    public int c = 0;
    public aomf f = aomf.b;

    static {
        ashd ashdVar = new ashd();
        a = ashdVar;
        aonm.registerDefaultInstance(ashd.class, ashdVar);
    }

    private ashd() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0004ဉ\t\u0005ည\n\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fဉ\u000b", new Object[]{"d", "c", "b", ashc.class, ashe.class, "e", "f", asgz.class, ashf.class, asha.class, asgx.class, asgw.class, asgv.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ashd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (ashd.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
