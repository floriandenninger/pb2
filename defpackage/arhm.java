package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arhm extends aonm implements aooz {
    public static final arhm a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apxf h;
    private atdf i;
    private aqyg j;
    private aota k;
    private byte l = 2;

    static {
        arhm arhmVar = new arhm();
        a = arhmVar;
        aonm.registerDefaultInstance(arhm.class, arhmVar);
    }

    private arhm() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\fᐉ\u000e\u000fᐉ\u0004", new Object[]{"c", "d", "e", "f", "h", "i", "j", "k", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arhm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arhm.class) {
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
