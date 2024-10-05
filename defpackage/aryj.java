package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aryj extends aonm implements aooz {
    public static final aryj a;
    private static volatile aopf r;
    public int b;
    public asuu c;
    public asuu d;
    public asuu e;
    public aonu f = emptyIntList();
    public int g;
    public asuu h;
    public asuu i;
    public asuu j;
    public asuu k;
    public asuu l;
    public asuu m;
    public asuu n;
    public asus o;
    public aony p;
    public awbj q;

    static {
        aryj aryjVar = new aryj();
        a = aryjVar;
        aonm.registerDefaultInstance(aryj.class, aryjVar);
    }

    private aryj() {
        emptyProtobufList();
        this.p = emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\rဉ\u000e\u000eဉ\t\u000fဉ\u000f\u0010\u0016\u0011င\u0003\u0012ဉ\u0007\u0013ဉ\b\u0014\u001b\u0019ဉ\u0012", new Object[]{"b", "c", "d", "e", "h", "i", "j", "n", "m", "o", "f", "g", "k", "l", "p", atyz.class, "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aryj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (aryj.class) {
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
