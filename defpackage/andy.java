package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andy extends aonm implements aooz {
    public static final andy a;
    private static volatile aopf r;
    public int b;
    public int c;
    public int d;
    public andw e;
    public long f;
    public aned g;
    public andx h;
    public anei i;
    public anec j;
    public aneg k;
    public andv l;
    public anee m;
    public aneb n;
    public aneh o;
    public andz p;
    public anea q;

    static {
        andy andyVar = new andy();
        a = andyVar;
        aonm.registerDefaultInstance(andy.class, andyVar);
    }

    private andy() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\r\u0000\u0003\nC\r\u0000\u0000\u0000\nဉ\b\u0015ဂ\u0013 ဉ\u001e(ဉ&.ဉ,0ဉ.1ဉ/3ဉ16ဉ4?ဉ=@ဉ>Bဉ@CဉA", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new andy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (andy.class) {
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
