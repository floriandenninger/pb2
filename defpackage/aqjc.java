package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjc extends aonh implements aoni {
    public static final aqjc a;
    private static volatile aopf z;
    private aota A;
    public int b;
    public Object d;
    public aqyg e;
    public aqyg f;
    public apmh g;
    public avgm h;
    public avgm i;
    public avgg j;
    public aqja k;
    public apxf m;
    public apxf n;
    public aqjb o;
    public int r;
    public atdf s;
    public float t;
    public boolean u;
    public int v;
    public int w;
    public int c = 0;
    private byte B = 2;
    public aony p = emptyProtobufList();
    public aonu q = emptyIntList();
    public aomf x = aomf.b;
    public aony y = emptyProtobufList();

    static {
        aqjc aqjcVar = new aqjc();
        a = aqjcVar;
        aonm.registerDefaultInstance(aqjc.class, aqjcVar);
    }

    private aqjc() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.B);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.B = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0001\u0001\u0001\u001c\u0017\u0000\u0003\u000f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ဉ\t\bЛ\tᐉ\u0014\nည\u0015\u000bᐉ\u0003\fᐉ\u0004\r\u001d\u000eᐉ\r\u000fᐉ\b\u0010ခ\u000e\u0011ဇ\u000f\u0012ᐼ\u0000\u0013င\u0012\u0014င\u0013\u0016ᐼ\u0000\u0018ဌ\u000b\u001aᐉ\u0006\u001cЛ", new Object[]{"d", "c", "b", "e", "f", "g", "j", "m", "o", "p", apxf.class, "A", "x", "h", "i", "q", "s", "n", "t", "u", avwb.class, "v", "w", aulq.class, "r", apyu.q, "k", "y", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqjc();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = z;
                if (aopfVar == null) {
                    synchronized (aqjc.class) {
                        aopfVar = z;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            z = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
