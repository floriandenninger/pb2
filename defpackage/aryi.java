package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryi extends aonm implements aooz {
    public static final aryi a;
    private static volatile aopf q;
    public int b;
    public int c;
    public aryg f;
    public aryh g;
    public aryf h;
    public aulq i;
    public arxz j;
    public arxy k;
    public aryd l;
    public aryz m;
    public aryc n;
    public aomf o;
    public aomf p;
    private aryw r;
    private aulq s;
    private avka t;
    private byte u = 2;
    public String d = "";
    public String e = "";

    static {
        aryi aryiVar = new aryi();
        a = aryiVar;
        aonm.registerDefaultInstance(aryi.class, aryiVar);
    }

    private aryi() {
        emptyProtobufList();
        aonm.emptyProtobufList();
        this.o = aomf.b;
        this.p = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0001!\u0011\u0000\u0000\n\u0001ဌ\u0000\u0002ဈ\u0001\bᐉ\u0005\nᐉ\u000e\u000bᐉ\n\rᐉ\u0010\u0010ᐉ\u000b\u0011ဉ\u0003\u0012ᐉ\u0011\u0013ᐉ\u0012\u0015ဉ\b\u0016ဈ\u0002\u0018ᐉ\t\u0019ᐉ\u0014\u001fည\u0016 ည\u0017!ᐉ\u0018", new Object[]{"b", "c", atqp.t, "d", "g", "l", "j", "m", "k", "f", "n", "r", "h", "e", "i", "s", "o", "p", "t"});
            case NEW_MUTABLE_INSTANCE:
                return new aryi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (aryi.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
