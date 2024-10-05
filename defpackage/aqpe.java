package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpe extends aonm implements aooz {
    public static final aqpe a;
    private static volatile aopf f;
    public int b;
    public aqpg c;
    public aqpk d;
    public aqpj e;
    private ausg g;
    private ausf h;
    private aqpf i;
    private aqpl j;
    private byte k = 2;

    static {
        aqpe aqpeVar = new aqpe();
        a = aqpeVar;
        aonm.registerDefaultInstance(aqpe.class, aqpeVar);
    }

    private aqpe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\uf85c⇧\uf22c鼠\u0007\u0000\u0000\u0007\uf85c⇧ᐉ\u0000\ue9c1⇨ᐉ\u0002\ueb8b≢ᐉ\u0001窱┕ᐉ\u0003\uf79d⼚ᐉ\u0004\uecb5㨞ᐉ\u0005\uf22c鼠ᐉ\u0006", new Object[]{"b", "g", "i", "h", "c", "d", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqpe.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
