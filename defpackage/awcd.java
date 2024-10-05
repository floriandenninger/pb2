package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcd extends aonh implements aoni {
    public static final awcd a;
    private static volatile aopf i;
    public int b;
    public awcm c;
    public awcj d;
    public int f;
    public aqyg g;
    public aqrh h;
    private aota j;
    private byte k = 2;
    public aony e = emptyProtobufList();

    static {
        awcd awcdVar = new awcd();
        a = awcdVar;
        aonm.registerDefaultInstance(awcd.class, awcdVar);
    }

    private awcd() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004င\u0002\u0005ᐉ\u0003\bᐉ\u0005\u000bဉ\u0004", new Object[]{"b", "c", "d", "e", awda.class, "f", "g", "j", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awcd();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awcd.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
