package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aowm extends aonm implements aooz {
    public static final aowm a;
    private static volatile aopf p;
    public int b;
    public Object d;
    public aqyg e;
    public avgg f;
    public arfs g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public apxf m;
    private aota q;
    public int c = 0;
    private byte r = 2;
    public aony n = emptyProtobufList();
    public aomf o = aomf.b;

    static {
        aowm aowmVar = new aowm();
        a = aowmVar;
        aonm.registerDefaultInstance(aowm.class, aowmVar);
    }

    private aowm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ှ\u0000\u0004ဋ\u0005\u0005ᐉ\t\u0006ᐉ\n\u0007ည\u000b\bဋ\u0006\tဋ\b\nЛ\fᐉ\u0002\rဋ\u0004\u000eဋ\u0007", new Object[]{"d", "c", "b", "e", "f", "i", "m", "q", "o", "j", "l", "n", apxf.class, "g", "h", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aowm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aowm.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
