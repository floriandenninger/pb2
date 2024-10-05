package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avcn extends aonm implements aooz {
    public static final avcn a;
    private static volatile aopf g;
    public int b;
    public avci c;
    public avbz d;
    public avcd e;
    public avcb f;
    private byte h = 2;

    static {
        avcn avcnVar = new avcn();
        a = avcnVar;
        aonm.registerDefaultInstance(avcn.class, avcnVar);
    }

    private avcn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ue55e⡇\ue628堙\u0004\u0000\u0000\u0004\ue55e⡇ᐉ\u0000\ue1c5㙻ᐉ\u0001\uf6b6䣧ᐉ\u0002\ue628堙ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avcn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avcn.class) {
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
