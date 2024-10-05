package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auzn extends aonm implements aooz {
    public static final auzn a;
    private static volatile aopf e;
    public int b;
    public aqkv c;
    public auzm d;
    private attb f;
    private awgt g;
    private byte h = 2;

    static {
        auzn auznVar = new auzn();
        a = auznVar;
        aonm.registerDefaultInstance(auzn.class, auznVar);
    }

    private auzn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001ﱃ\u196f\uf39a\u1f17\u0004\u0000\u0000\u0004ﱃ\u196fᐉ\u0002\ue5d9ᩭᐉ\u0000\uf875ᯧᐉ\u0001\uf39a\u1f17ᐉ\u0003", new Object[]{"b", "c", "f", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new auzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auzn.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
