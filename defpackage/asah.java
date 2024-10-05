package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asah extends aonm implements aooz {
    public static final asah a;
    private static volatile aopf o;
    public int b;
    public arnd c;
    public long d;
    public asai e;
    public asak f;
    public aulp g;
    public aomf h;
    public asae i;
    public asaf j;
    public aony k;
    public arzz l;
    public aony m;
    public aony n;
    private aota p;
    private asal q;
    private aqzg r;
    private byte s = 2;

    static {
        asah asahVar = new asah();
        a = asahVar;
        aonm.registerDefaultInstance(asah.class, asahVar);
    }

    private asah() {
        aomf aomfVar = aomf.b;
        aonm.emptyProtobufList();
        this.h = aomf.b;
        this.k = emptyProtobufList();
        this.m = aonm.emptyProtobufList();
        this.n = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001̉\u000f\u0000\u0003\f\u0001ᐉ\u0001\u0002ဂ\u0002\u0004ᐉ\u0003\u0007ᐉ\u0005\tည\t\nᐉ\u0004\rᐉ\n\u000eᐉ\u0000\u0010ᐉ\u000b\u0012ᐉ\f\u0016\u001a\u001aЛ\u001bᐉ\r\u001cЛ̉ᐉ\u0012", new Object[]{"b", "c", "d", "e", "g", "h", "f", "i", "p", "q", "j", "m", "k", apxf.class, "l", "n", aulq.class, "r"});
            case NEW_MUTABLE_INSTANCE:
                return new asah();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (asah.class) {
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
