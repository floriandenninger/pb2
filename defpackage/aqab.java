package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqab extends aonm implements aooz {
    public static final aqab a;
    private static volatile aopf o;
    public int b;
    public apmh c;
    public int d;
    public avgg e;
    public aqyg f;
    public apxf g;
    public apmh h;
    public awkb i;
    public apmh j;
    public aulq k;
    public String l;
    public apxf m;
    public String n;
    private apmh p;
    private apxf q;
    private apjc r;
    private apjb s;
    private apja t;
    private aota u;
    private aulq v;
    private apxf w;
    private byte x = 2;

    static {
        aqab aqabVar = new aqab();
        a = aqabVar;
        aonm.registerDefaultInstance(aqab.class, aqabVar);
    }

    private aqab() {
        aomf aomfVar = aomf.b;
        this.l = "";
        this.n = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0000\u0011\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\u000f\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\u000b\fဌ\u0002\rᐉ\n\u000eᐉ\u0006\u0010ᐉ\f\u0012ᐉ\r\u0014ဈ\u0011\u0015ᐉ\u0012\u0016ᐉ\u0013\u0017ဈ\u0014\u0018ᐉ\u0015", new Object[]{"b", "c", "p", "e", "f", "g", "u", "r", "s", "t", "i", "d", auqy.m, "h", "q", "j", "k", "l", "v", "m", "n", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new aqab();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (aqab.class) {
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
