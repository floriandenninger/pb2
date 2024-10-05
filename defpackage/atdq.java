package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdq extends aonm implements aooz {
    public static final atdq a;
    private static volatile aopf d;
    public int b;
    public atdp c;
    private byte e = 2;

    static {
        atdq atdqVar = new atdq();
        a = atdqVar;
        aonm.registerDefaultInstance(atdq.class, atdqVar);
    }

    private atdq() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\ue2ddそ\ue2ddそ\u0001\u0000\u0000\u0001\ue2ddそᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new atdq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atdq.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
