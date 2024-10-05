package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rkq extends aonm implements aooz {
    public static final rkq a;
    private static volatile aopf h;
    public int b;
    public int c;
    public boolean d;
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        rkq rkqVar = new rkq();
        a = rkqVar;
        aonm.registerDefaultInstance(rkq.class, rkqVar);
    }

    private rkq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", dvg.r, "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new rkq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (rkq.class) {
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
