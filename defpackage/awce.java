package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awce extends aonm implements aooz {
    public static final awce a;
    private static volatile aopf f;
    public int b;
    public apxf d;
    public aqyg e;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public aony c = emptyProtobufList();

    static {
        awce awceVar = new awce();
        a = awceVar;
        aonm.registerDefaultInstance(awce.class, awceVar);
    }

    private awce() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "g", "c", awcc.class, "d", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awce();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awce.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
