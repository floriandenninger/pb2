package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atgz extends aonm implements aooz {
    public static final atgz a;
    private static volatile aopf k;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public apxf f;
    public atgy g;
    public atgx h;
    public aqyg i;
    public aomf j;
    private aota l;
    private byte m = 2;

    static {
        atgz atgzVar = new atgz();
        a = atgzVar;
        aonm.registerDefaultInstance(atgz.class, atgzVar);
    }

    private atgz() {
        emptyProtobufList();
        this.j = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\b\u0006ᐉ\t\u0007ᐉ\u0004\bᐉ\u0005\nᐉ\u0007", new Object[]{"b", "c", "d", "e", "f", "j", "l", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new atgz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atgz.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
