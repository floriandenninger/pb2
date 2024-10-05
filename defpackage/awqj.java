package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awqj extends aonm implements aooz {
    public static final awqj a;
    private static volatile aopf b;
    private int c;
    private awnw d;
    private awnw e;
    private awnw f;
    private aota g;
    private byte h = 2;

    static {
        awqj awqjVar = new awqj();
        a = awqjVar;
        aonm.registerDefaultInstance(awqj.class, awqjVar);
    }

    private awqj() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u001a\u0004\u0000\u0000\u0004\u0004ᐉ\u0002\u0006ᐉ\u0014\fᐉ\u0003\u001aᐉ\u0004", new Object[]{"c", "d", "g", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awqj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awqj.class) {
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
