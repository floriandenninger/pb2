package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjq extends aonm implements aooz {
    public static final arjq a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arjq arjqVar = new arjq();
        a = arjqVar;
        aonm.registerDefaultInstance(arjq.class, arjqVar);
    }

    private arjq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u00017\u0001\u0000\ue002ᘡ\ue37d떂7\u0000\u00007\ue002ᘡᐼ\u0000\ueb38៴ᐼ\u0000\ue059ᥧᐼ\u0000\ue28dṰᐼ\u0000\uec4fẲᐼ\u0000\uef3c⊱ᐼ\u0000\uf3cf⛠ᐼ\u0000\uf449⡛ᐼ\u0000\uf86d⣉ᐼ\u0000\ue845⦨ᐼ\u0000\uec4a⫳ᐼ\u0000\uf5ea⮔ᐼ\u0000ﾸ⸜ᐼ\u0000\uea92⹕ᐼ\u0000樂⾪ᐼ\u0000\ue59e\u2fe0ᐼ\u0000\uf288すᐼ\u0000ﲣヅᐼ\u0000ﻍㄎᐼ\u0000\uf227㔀ᐼ\u0000\ue727㝤ᐼ\u0000ﶇ㯺ᐼ\u0000ﺶ㱾ᐼ\u0000\uf3c8䔆ᐼ\u0000\ued5c䝠ᐼ\u0000\uf492䤳ᐼ\u0000\uf1cb䧺ᐼ\u0000\uf385䨬ᐼ\u0000ｍ䩮ᐼ\u0000\ue90b䯘ᐼ\u0000\uf6fe勇ᐼ\u0000\uee40勒ᐼ\u0000煮勒ᐼ\u0000羅娆ᐼ\u0000\ue4a5巤ᐼ\u0000﹁彩ᐼ\u0000\ue0c5捎ᐼ\u0000\ue417撪ᐼ\u0000\uee38柗ᐼ\u0000\ueb16棪ᐼ\u0000\ue969歼ᐼ\u0000\uf59d瘾ᐼ\u0000\uedb0矰ᐼ\u0000\ue945硤ᐼ\u0000\ue3a4篸ᐼ\u0000\uea81褡ᐼ\u0000\ue00f鑻ᐼ\u0000画閑ᐼ\u0000ﳝꄷᐼ\u0000ﹷꦞᐼ\u0000充ꬽᐼ\u0000臭걲ᐼ\u0000\ufe6c겑ᐼ\u0000\ue14c끤ᐼ\u0000\ue37d떂ᐼ\u0000", new Object[]{"c", "b", apna.class, aqwi.class, aubg.class, avkf.class, aqhe.class, avki.class, aqhl.class, auog.class, araj.class, arak.class, arai.class, apcc.class, auas.class, avog.class, atiz.class, assr.class, auvc.class, avin.class, aqec.class, apzj.class, avpx.class, avpc.class, auzf.class, apoj.class, atio.class, aqrf.class, arfn.class, avjy.class, avzc.class, aqjx.class, atir.class, atis.class, atje.class, asiw.class, asky.class, arad.class, askt.class, aqvo.class, aqbd.class, avop.class, atlh.class, aqvw.class, apog.class, atky.class, atjm.class, atlf.class, ards.class, aurk.class, aujw.class, atja.class, atle.class, atit.class, apra.class, asls.class, avot.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arjq.class) {
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
