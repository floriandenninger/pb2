package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auqg extends aonm implements aooz {
    public static final auqg a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public apxf g;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aota l;
    private byte m = 2;

    static {
        auqg auqgVar = new auqg();
        a = auqgVar;
        aonm.registerDefaultInstance(auqg.class, auqgVar);
    }

    private auqg() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\t\u0001ᐉ\u0001\u0002ᐉ\u0004\u0003ᐉ\u0002\u0004ᐉ\u0007\u0005ᐉ\b\u0007ᐉ\u0003\tᐉ\u000b\u000bᐉ\u0005\fᐉ\u0006", new Object[]{"b", "c", "e", "d", "f", "g", "i", "l", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auqg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auqg.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
