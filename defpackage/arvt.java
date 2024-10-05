package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arvt extends aonm implements aooz {
    public static final arvt a;
    private static volatile aopf x;
    private apxf A;
    public int b;
    public int c;
    public arnb d;
    public arvo f;
    public arvb g;
    public arvj h;
    public arvi i;
    public arvm j;
    public arva k;
    public aruz l;
    public arvf m;
    public arvh n;
    public arvc o;
    public arvp p;
    public arvq q;
    public arvk r;
    public arvg s;
    public arvd t;
    public arve u;
    public arvl v;
    public arvn w;
    private int y;
    private apxf z;
    private byte B = 2;
    public String e = "";

    static {
        arvt arvtVar = new arvt();
        a = arvtVar;
        aonm.registerDefaultInstance(arvt.class, arvtVar);
    }

    private arvt() {
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
                return newMessageInfo(a, "\u0001\u0016\u0000\u0003\u0001J\u0016\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\b\u0007ဉ\t\u000bဉ\r\rဉ\u000f\u000eဉ\u0010\u0011ဉ\u0013\u0012ဉ\u0014\u0014ဉ\u0016\u0015ဉ\u0018\u0016ဉ\u0019\u0017ဉ\u001a\u0019ဉ\u001b&ဉ\u00061ဉ12ဉ2IᐉGJᐉH", new Object[]{"b", "c", "y", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "i", "v", "w", "z", "A"});
            case NEW_MUTABLE_INSTANCE:
                return new arvt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = x;
                if (aopfVar == null) {
                    synchronized (arvt.class) {
                        aopfVar = x;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            x = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
