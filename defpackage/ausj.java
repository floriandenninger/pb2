package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ausj extends aonm implements aooz {
    public static final ausj a;
    private static volatile aopf b;
    private int c;
    private atdn d;
    private byte e = 2;

    static {
        ausj ausjVar = new ausj();
        a = ausjVar;
        aonm.registerDefaultInstance(ausj.class, ausjVar);
    }

    private ausj() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue592᯦\ue592᯦\u0001\u0000\u0000\u0001\ue592᯦ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ausj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ausj.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
