package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspk extends aonm implements aooz {
    public static final aspk a;
    private static volatile aopf h;
    public int b;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public apxf g;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aota m;
    private byte n = 2;
    public String c = "";

    static {
        aspk aspkVar = new aspk();
        a = aspkVar;
        aonm.registerDefaultInstance(aspk.class, aspkVar);
    }

    private aspk() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0013\n\u0000\u0000\t\u0001ဈ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\tᐉ\b\nᐉ\t\u000bᐉ\n\u000eᐉ\f\u0012ᐉ\u0006\u0013ᐉ\u0007", new Object[]{"b", "c", "i", "d", "e", "k", "l", "g", "m", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aspk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aspk.class) {
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
