package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdx extends aonm implements aooz {
    public static final atdx a;
    private static volatile aopf d;
    public int b;
    public aszm c;
    private aszb e;
    private aszc f;
    private apkj g;
    private aszr h;
    private aszh i;
    private aszg j;
    private aszs k;
    private asze l;
    private asyw m;
    private aszd n;
    private asyz o;
    private asza p;
    private aszf q;
    private asyx r;
    private aszp s;
    private aszl t;
    private aszj u;
    private atdn v;
    private astu w;
    private asyy x;
    private aszo y;
    private byte z = 2;

    static {
        atdx atdxVar = new atdx();
        a = atdxVar;
        aonm.registerDefaultInstance(atdx.class, atdxVar);
    }

    private atdx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.z);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.z = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0016\u0000\u0001\ue5d8ᡈ\uf6f5爙\u0016\u0000\u0000\u0016\ue5d8ᡈᐉ\u0002\ue592᯦ᐉ\u0014ﵝῈᐉ\u0006ﵾῈᐉ\u0007\uf26c\u209eᐉ\b\uf8db₩ᐉ\u000b\uf181₯ᐉ\f\uf433₯ᐉ\u000e\uf436₯ᐉ\u000f\uf442₯ᐉ\u0010\ue57eℎᐉ\u0000\uf47f╛ᐉ\u0003\ue72f⯇ᐉ\u0017\uef36⯌ᐉ\u0012\uf426ⵢᐉ\u001b\uf620⽏ᐉ\u0013\uf1e4⽐ᐉ\t\uf219〡ᐉ\u0001\ue8ea㙁ᐉ\u0004\uf033㚈ᐉ\u0005瀞䢤ᐉ\u0015\uf6f5爙ᐉ\u0011", new Object[]{"b", "g", "v", "k", "l", "c", "n", "o", "p", "q", "r", "e", "h", "x", "t", "y", "u", "m", "f", "i", "j", "w", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new atdx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atdx.class) {
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
