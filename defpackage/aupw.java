package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aupw extends aonm implements aooz {
    private static volatile aopf S;
    public static final aupw a;
    public avnu A;
    public avnw B;
    public avnx C;
    public avom D;
    public avph E;
    public auqq F;
    public avpz G;
    public auqu H;
    public auqr I;

    /* renamed from: J, reason: collision with root package name */
    public auqo f127J;
    public auqt K;
    public avov L;
    public auqp M;
    public avor N;
    public auqm O;
    public aupn P;
    public auqn Q;
    public aupo R;
    private byte T = 2;
    public int b;
    public int c;
    public aupt d;
    public aupu e;
    public aupy f;
    public auqg g;
    public auqh h;
    public auqe i;
    public auqj j;
    public aupv k;
    public aupm l;
    public aqzy m;
    public arau n;
    public auqf o;
    public auql p;
    public auqi q;
    public aupk r;
    public aupl s;
    public aupp t;
    public aups u;
    public aupj v;
    public apum w;
    public apuk x;
    public avqs y;
    public avrc z;

    static {
        aupw aupwVar = new aupw();
        a = aupwVar;
        aonm.registerDefaultInstance(aupw.class, aupwVar);
    }

    private aupw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.T);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.T = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001)\u0000\u0002\uf004ᴽ\ue123띙)\u0000\u0000(\uf004ᴽᐉ\u0004\uf7d8ᴾᐉ\u0001\ue6c6Ὺᐉ\u0007\uf415∱ᐉ\u0000\ue65c⌷ᐉ\f\ue0e7⏒ᐉ\u0002\uf7d7␇ᐉ\u000b\uf1de⒩ᐉ\u0003\ue0dd⠘ᐉ\b\ue71b⡺ᐉ\u0006\uea85⢲ဉ\u000e\uf006⢾ᐉ\u000f\ue80a㭴ᐉ\rﱪ㴵ᐉ\u001e\uf146㽭ᐉ\u0010ﬅ㽰ᐉ\u0011\ueee5㽴ᐉ\u001f\uf5f8䀱ᐉ%\uea13䃆ᐉ$\uf347䃺ᐉ\u0018\uf348䃺ᐉ\u0019\uf34b䃺ᐉ\u0017\ue2ce䉥ᐉ \ue39b䐄ᐉ\"\uf1dd䙇ᐉ\u0012\ue9f2䩆ᐉ\t\uec67䩗ᐉ\nﺝ䬘ᐉ#\ue334儕ᐉ&︻儤ᐉ'\ue463儧ᐉ(\uf814卓ᐉ\u001cﷶ咦ᐉ\u001d\ufadc垙ᐉ\u0013ﲛ埿ᐉ\u0014\ue1dd寰ᐉ\u001a\uf707峬ᐉ\u001b\uedd3蘕ᐉ\u0005\ueee8ꇏᐉ\u0016ﶶꇹᐉ\u0015\ue123띙ᐉ!", new Object[]{"b", "c", "h", "e", "k", "d", "p", "f", "o", "g", "l", "j", "r", "s", "q", "H", "t", "u", "I", "O", "N", "B", "C", "A", "J", "L", "v", "m", "n", "M", "P", "Q", "R", "F", "G", "w", "x", "D", "E", "i", "z", "y", "K"});
            case NEW_MUTABLE_INSTANCE:
                return new aupw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = S;
                if (aopfVar == null) {
                    synchronized (aupw.class) {
                        aopfVar = S;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            S = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
