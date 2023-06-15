package emu.grasscutter.scripts.data;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class SceneMonster extends SceneObject{
	public int config_id;
    public int monster_id;
	public int pose_id;
    public int level;
	public int drop_id;
	public boolean disableWander;
    public int title_id;
    public int special_name_id;
    public String drop_tag;
    public int mark_flag;
    public int climate_area_id;
    public int[] affix;
    public int ai_config_id;
    public int kill_score;
    public int speed_level;
}
