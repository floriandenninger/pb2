package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arqy extends aonm implements aooz {
    public static final arqy a;
    private static volatile aopf i;
    public boolean c;
    public int d;
    public long e;
    public arrh g;
    public arra h;
    private int j;
    private arri k;
    private arrg l;
    private arre m;
    private byte n = 2;
    public String b = "";
    public aony f = emptyProtobufList();

    static {
        arqy arqyVar = new arqy();
        a = arqyVar;
        aonm.registerDefaultInstance(arqy.class, arqyVar);
    }

    private arqy() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0007Л\bᐉ\u0007\tᐉ\b\nᐉ\f\u000eᐉ\t\u0011ᐉ\u000b", new Object[]{"j", "b", "c", "d", armv.j, "e", "f", arrf.class, "g", "k", "h", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new arqy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arqy.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
