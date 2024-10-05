package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class autm extends aonm implements aooz {
    public static final autm a;
    private static volatile aopf y;
    private int A;
    private int B;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    private int z;

    static {
        autm autmVar = new autm();
        a = autmVar;
        aonm.registerDefaultInstance(autm.class, autmVar);
    }

    private autm() {
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
                return newMessageInfo(a, "\u0001\u0017\u0000\u0003\u0006D\u0017\u0000\u0000\u0000\u0006ဇ\u0005\bဇ\u0007\u000bဇ\n\u0010ဇ\u000f\u0011ဇ\u0010\u0012င\u0011\u0013င\u0012\u0016ဇ\u0015\u001bဇ\u001a\u001eဇ\u001d&ဇ&'ဇ()ဇ*.င1/ဇ20ဇ31ဇ+4ဇ48ဇ89ဇ0>ဇ=CဇBDဇC", new Object[]{"z", "A", "B", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "o", "t", "u", "p", "v", "w", "x"});
            case NEW_MUTABLE_INSTANCE:
                return new autm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = y;
                if (aopfVar == null) {
                    synchronized (autm.class) {
                        aopfVar = y;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            y = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
