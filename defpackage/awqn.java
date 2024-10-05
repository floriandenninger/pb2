package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awqn extends aonm implements aooz {
    public static final awqn a;
    private static volatile aopf b;
    private int c;
    private awqi d;
    private awnw e;
    private awqp f;
    private awqq g;
    private aota h;
    private byte i = 2;

    static {
        awqn awqnVar = new awqn();
        a = awqnVar;
        aonm.registerDefaultInstance(awqn.class, awqnVar);
    }

    private awqn() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u000e\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0007ᐉ\u0006\nဉ\t\fᐉ\n\u000eᐉ\r", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awqn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awqn.class) {
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
