package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class audl extends aonm implements aooz {
    public static final audl a;
    private static volatile aopf i;
    public int b;
    public apmh c;
    public aqyg d;
    public int e;
    public int f;
    public int g;
    public int h;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private audm m;
    private byte n = 2;

    static {
        audl audlVar = new audl();
        a = audlVar;
        aonm.registerDefaultInstance(audl.class, audlVar);
    }

    private audl() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003င\u0005\u0004င\u0006\u0005င\u0007\u0006င\b\u0007ᐉ\u0002\tᐉ\u0003\fᐉ\n\rᐉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new audl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (audl.class) {
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
