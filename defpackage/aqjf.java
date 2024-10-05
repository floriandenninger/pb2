package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjf extends aonm implements aooz {
    public static final aqjf a;
    private static volatile aopf q;
    public int b;
    public int c;
    public int d;
    public aqje e;
    public aqjg f;
    public aqjj g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public float m;
    public boolean n;
    public float o;
    public boolean p;

    static {
        aqjf aqjfVar = new aqjf();
        a = aqjfVar;
        aonm.registerDefaultInstance(aqjf.class, aqjfVar);
    }

    private aqjf() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u001c\u000e\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0007\u0005င\u0001\bဉ\u0004\nဉ\t\u000bင\n\rင\r\u000eဇ\u000e\u0015ဇ\u0013\u0016ခ\u0014\u0019ဇ\u0017\u001aင\f\u001bခ\u0018\u001cဇ\u0019", new Object[]{"b", "c", "f", "d", "e", "g", "h", "j", "k", "l", "m", "n", "i", "o", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqjf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (aqjf.class) {
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
