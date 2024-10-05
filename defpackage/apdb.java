package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apdb extends aonm implements aooz {
    public static final apdb a;
    private static volatile aopf r;
    public boolean b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public float h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    private int s;
    private int t;

    static {
        apdb apdbVar = new apdb();
        a = apdbVar;
        aonm.registerDefaultInstance(apdb.class, apdbVar);
    }

    private apdb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0002\u0002)\u0010\u0000\u0000\u0000\u0002ဇ\u0001\u0005ဇ\u0007\u000fခ\u0004\u0010ဇ\r\u0011ဇ\u000e\u0012ခ\u000f\u0014ခ\u0005\u0016ဇ\u0012\u001dဇ\u0018\"ဇ\u001f$ဇ\u001e%ဇ &ဇ!'ဇ\"(ဇ#)င$", new Object[]{"s", "t", "b", "e", "c", "f", "g", "h", "d", "i", "j", "l", "k", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new apdb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (apdb.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
