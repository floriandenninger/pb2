package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulz extends aonm implements aooz {
    public static final aulz a;
    private static volatile aopf j;
    public int b;
    public atnz c;
    public atni d;
    public atde e;
    public atdb f;
    public apql g;
    public arih h;
    public aujo i;
    private atdn k;
    private arev l;
    private arpw m;
    private byte n = 2;

    static {
        aulz aulzVar = new aulz();
        a = aulzVar;
        aonm.registerDefaultInstance(aulz.class, aulzVar);
    }

    private aulz() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\ue46d\u1738\uf367꽾\n\u0000\u0000\n\ue46d\u1738ᐉ\u0004\ue592᯦ᐉ\u0006\uef94ᾮᐉ\u0003\uefc3ᾮᐉ\u0002\ufe1a⌶ᐉ\u0000\uf74f⩫ᐉ\u0007\ued00㋚ᐉ\b\uec26㩻ᐉ\u0001\uf3df㮧ᐉ\u0005\uf367꽾ᐉ\t", new Object[]{"b", "g", "k", "f", "e", "c", "l", "m", "d", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aulz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aulz.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
