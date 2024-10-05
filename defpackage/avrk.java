package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avrk extends aonm implements aooz {
    public static final avrk a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apmh h;
    private apmh i;
    private apxf j;
    private aota k;
    private byte l = 2;

    static {
        avrk avrkVar = new avrk();
        a = avrkVar;
        aonm.registerDefaultInstance(avrk.class, avrkVar);
    }

    private avrk() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\bᐉ\u000b\u000bᐉ\u0003\u000fᐉ\t", new Object[]{"c", "d", "f", "g", "h", "i", "k", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avrk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avrk.class) {
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
