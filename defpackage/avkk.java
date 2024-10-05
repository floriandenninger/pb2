package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avkk extends aonm implements aooz {
    public static final avkk a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private apxf i;
    private aota j;
    private atdf k;
    private byte l = 2;

    static {
        avkk avkkVar = new avkk();
        a = avkkVar;
        aonm.registerDefaultInstance(avkk.class, avkkVar);
    }

    private avkk() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0003\u000e\b\u0000\u0000\b\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\b\u000bᐉ\u0007\fᐉ\u0005\u000eᐉ\n", new Object[]{"c", "d", "e", "f", "h", "j", "i", "g", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new avkk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avkk.class) {
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
