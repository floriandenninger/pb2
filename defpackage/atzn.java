package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzn extends aonm implements aooz {
    public static final atzn a;
    private static volatile aopf d;
    public int b;
    public atzm c;
    private atzu e;
    private byte f = 2;

    static {
        atzn atznVar = new atzn();
        a = atznVar;
        aonm.registerDefaultInstance(atzn.class, atznVar);
    }

    private atzn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\uedd3⯱立㵯\u0002\u0000\u0000\u0002\uedd3⯱ᐉ\u0000立㵯ᐉ\u0001", new Object[]{"b", "c", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atzn.class) {
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
