package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aved extends aonm implements aooz {
    public static final aved a;
    private static volatile aopf d;
    public int b;
    public auov c;
    private askd e;
    private avek f;
    private aquj g;
    private aubs h;
    private aqez i;
    private avok j;
    private araz k;
    private atdn l;
    private avkm m;
    private aupv n;
    private aupu o;
    private aupn p;
    private auqn q;
    private aupo r;
    private aupt s;
    private auqg t;
    private auqh u;
    private aumm v;
    private atkp w;
    private byte x = 2;

    static {
        aved avedVar = new aved();
        a = avedVar;
        aonm.registerDefaultInstance(aved.class, avedVar);
    }

    private aved() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\ue824ᝌ\ue7f2蓫\u0014\u0000\u0000\u0014\ue824ᝌᐉ\u0002\ue7f5ណᐉ\u0000\uec06\u17efᐉ\u0001\uf158ᠤᐉ\u0004\ue592᯦ᐉ\n\uf004ᴽᐉ\u0013\uf7d8ᴾᐉ\r﮼\u1f4fᐉ\t\ue6c6Ὺᐉ\f\uf415∱ᐉ\u0011\uec84⎵ᐉ\u0005\uf1de⒩ᐉ\u0012\uf11e⠗ᐉ\u0003\ue0df㢚ᐉ\u0006\uee53䴝ᐉ\u000b\ue334儕ᐉ\u000e︻儤ᐉ\u000f\ue463儧ᐉ\u0010神禠ᐉ\u0014\ue7f2蓫ᐉ\u0015", new Object[]{"b", "f", "c", "e", "h", "l", "u", "o", "k", "n", "s", "i", "t", "g", "j", "m", "p", "q", "r", "v", "w"});
            case NEW_MUTABLE_INSTANCE:
                return new aved();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aved.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
