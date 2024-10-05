package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwe extends aonh implements aoni {
    public static final aqwe a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public apxf e;
    public aqyg f;
    public aqyg g;
    public aqwf h;
    public aony i;
    private aqyg k;
    private atdf m;
    private aqwd n;
    private aota o;
    public int c = 0;
    private byte p = 2;

    static {
        aqwe aqweVar = new aqwe();
        a = aqweVar;
        aonm.registerDefaultInstance(aqwe.class, aqweVar);
    }

    private aqwe() {
        emptyProtobufList();
        emptyProtobufList();
        this.i = emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000f\u000b\u0000\u0001\u000b\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\bᐉ\t\tᐉ\u000b\nᐉ\u0007\rᐉ\b\u000eᐼ\u0000\u000fЛ", new Object[]{"d", "c", "b", avgg.class, "e", "f", "k", "g", "n", "o", "h", "m", arfs.class, "i", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqwe();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqwe.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
