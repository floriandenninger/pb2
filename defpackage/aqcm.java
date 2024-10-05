package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcm extends aonh implements aoni {
    public static final aqcm a;
    private static volatile aopf o;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public apxf g;
    public apxf h;
    public apmh i;
    public apmh j;
    public apxf k;
    public boolean m;
    public aomf n;
    private aulq p;
    private aota q;
    public int c = 0;
    private byte r = 2;

    static {
        aqcm aqcmVar = new aqcm();
        a = aqcmVar;
        aonm.registerDefaultInstance(aqcm.class, aqcmVar);
    }

    private aqcm() {
        emptyProtobufList();
        this.n = aomf.b;
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
                return newMessageInfo(a, "\u0001\r\u0001\u0001\u0001\u000f\r\u0000\u0000\u000b\u0001ᐼ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\r\tည\u000e\fᐉ\u0007\rᐼ\u0000\u000eဇ\n\u000fᐉ\u000b", new Object[]{"d", "c", "b", avgg.class, "e", "f", "g", "h", "i", "k", "q", "n", "j", arfs.class, "m", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqcm();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqcm.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
