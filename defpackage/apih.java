package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apih extends aonm implements aooz {
    public static final apih a;
    private static volatile aopf g;
    public int b;
    public aqkv c;
    public avul d;
    public aphx e;
    public atnz f;
    private byte h = 2;

    static {
        apih apihVar = new apih();
        a = apihVar;
        aonm.registerDefaultInstance(apih.class, apihVar);
    }

    private apih() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001ﱃ\u196fﮣⵇ\u0004\u0000\u0000\u0004ﱃ\u196fᐉ\u0000\ufe1a⌶ᐉ\u0003\ue607⨅ᐉ\u0001ﮣⵇᐉ\u0002", new Object[]{"b", "c", "f", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apih();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apih.class) {
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
