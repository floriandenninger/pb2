package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aozb extends aonh implements aoni {
    public static final aozb a;
    private static volatile aopf t;
    public int b;
    public avgg c;
    public aulq d;
    public aqyg e;
    public aulq f;
    public aqyg g;
    public aulq h;
    public aqyg i;
    public apxf j;
    public float k;
    public avgg n;
    public int o;
    public aulq p;
    public aozc r;
    public float s;
    private aota u;
    private byte v = 2;
    public aony m = emptyProtobufList();
    public aomf q = aomf.b;

    static {
        aozb aozbVar = new aozb();
        a = aozbVar;
        aonm.registerDefaultInstance(aozb.class, aozbVar);
    }

    private aozb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ᐉ\u0006\u0005ᐉ\u0007\u0006ခ\b\u0007Л\bᐉ\f\tည\r\nᐉ\t\u000bᐉ\u0001\fᐉ\u0003\rᐉ\u0005\u000eဋ\n\u000fᐉ\u000b\u0010ဉ\u000e\u0011ခ\u000f", new Object[]{"b", "c", "e", "g", "i", "j", "k", "m", apxf.class, "u", "q", "n", "d", "f", "h", "o", "p", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new aozb();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (aozb.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
